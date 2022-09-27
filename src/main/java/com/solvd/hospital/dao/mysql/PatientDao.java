package com.solvd.hospital.dao.mysql;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.solvd.hospital.dao.IPatientDao;
import com.solvd.hospital.models.Patient;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class PatientDao extends AbstractMySqlDao implements IPatientDao {

    private static final Logger LOGGER = LogManager.getLogger(PatientDao.class);
    @Override
    public void create(Patient object) {

    }

    @Override
    public Patient getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "SELECT users.id, users.login, users.password, users.name, users.surname, users.middle_name, " +
                "users.role, medical_cards.id as MedId From Users Inner Join medical_cards on medical_cards.patient_id = " +
                "users.id where users.role = 2 AND users.id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Patient patient = new Patient();
            while (rs.next()) {
                patient.setId(rs.getInt("id"));
                patient.setLogin(rs.getString("login"));
                patient.setPassword(rs.getString("password"));
                patient.setName(rs.getString("name"));
                patient.setSurname(rs.getString("surname"));
                patient.setMiddleName(rs.getString("middle_name"));
                patient.setRole(rs.getInt("role"));
                patient.setMedicalCardId(rs.getInt("MedId"));
            }
            rs.close();
            return patient;
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
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Delete From Users where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,id);
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
    }

    @Override
    public void update(Patient object) {

    }

    @Override
    public List<Patient> getPatients() {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "SELECT users.id, users.login, users.password, users.name, users.surname, users.middle_name, " +
                "users.role, medical_cards.id as MedId From Users Inner Join medical_cards on medical_cards.patient_id = " +
                "users.id where users.role = 2";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            List<Patient> patients = new ArrayList<Patient>();
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Patient patient = new Patient();
                patient.setId(rs.getInt("id"));
                patient.setLogin(rs.getString("login"));
                patient.setPassword(rs.getString("password"));
                patient.setName(rs.getString("name"));
                patient.setSurname(rs.getString("surname"));
                patient.setMiddleName(rs.getString("middle_name"));
                patient.setRole(rs.getInt("role"));
                patient.setMedicalCardId(rs.getInt("MedId"));
                patients.add(patient);
            }
            rs.close();
            return patients;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
        return null;
    }
}
