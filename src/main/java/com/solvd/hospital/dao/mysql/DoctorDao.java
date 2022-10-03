package com.solvd.hospital.dao.mysql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.solvd.hospital.dao.IDoctorDao;
import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.models.Doctor;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class DoctorDao extends AbstractMySqlDao implements IDoctorDao {

    private static final Logger LOGGER = LogManager.getLogger(DoctorDao.class);

    @Override
    public void create(Doctor object) {
        IUserDao userDao = new UserDao();
        userDao.create(object);
    }

    @Override
    public Doctor getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Select users.id, login, password, name, surname, middle_name, role, experiences.id As " +
                "expId From Users Left join experiences on " +
                "specialist_id = users.id  " +
                "where users.id = ? and role = 1";
        Doctor doctor =null;
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            doctor = new Doctor();
            while (rs.next()) {
                doctor.setId(rs.getInt("id"));
                doctor.setLogin(rs.getString("login"));
                doctor.setPassword(rs.getString("password"));
                doctor.setName(rs.getString("name"));
                doctor.setSurname(rs.getString("surname"));
                doctor.setMiddleName(rs.getString("middle_name"));
                doctor.setRole(rs.getInt("role"));
                doctor.setExperienceId(rs.getInt("expId"));
            }
            rs.close();
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        query = "Select medical_cards.id From Users Left join Medical_cards on medical_cards.doctor_id = users.id " +
                "where users.id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                doctor.getListOfMedicalCards().add(rs.getInt("medical_cards.id"));
            }
            rs.close();
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        query = "Select experiences.id From Users Left join Experiences on experiences.specialist_id = users.id " +
                "where users.id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                doctor.getListOfMedicalField().add(rs.getInt("experiences.id"));
            }
            rs.close();
            return doctor;
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
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Select id " +" From Users where role = 1";
        List<Doctor> doctors = new ArrayList<>();
        DoctorDao doctorDao = new DoctorDao();
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ResultSet rs = ps.executeQuery();
            Doctor doctor;
            while (rs.next()) {
                doctor = doctorDao.getById(rs.getInt("id"));
                doctors.add(doctor);
            }
            rs.close();
            return  doctors;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
        return  null;
    }
}
