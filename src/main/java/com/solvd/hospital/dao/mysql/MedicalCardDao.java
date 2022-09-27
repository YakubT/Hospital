package com.solvd.hospital.dao.mysql;

import com.solvd.hospital.models.Allergy;
import com.solvd.hospital.models.enums.Gender;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.*;

import com.solvd.hospital.dao.IMedicalCardDao;
import com.solvd.hospital.models.MedicalCard;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class MedicalCardDao extends AbstractMySqlDao implements IMedicalCardDao {

    private static final Logger LOGGER = LogManager.getLogger(MedicalCardDao.class);
    @Override
    public void create(MedicalCard object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Insert into MedicalCards (patient_id, date_of_birth, gender, address, phone_number, invalidity" +
                ", blood_group, diabetes, hepatitis, doctor_id) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,object.getPatientId());
            ps.setDate(2,(Date) object.getDateOfBirth());
            ps.setString(3, object.getGender().getValue());
            ps.setString(4,object.getAddress());
            ps.setString(5,object.getPhoneNumber());
            ps.setString(6,object.getInvalidity().getValue());
            ps.setString(7, object.getBloodGroup().getValue());
            ps.setBoolean(8,object.isDiabetes());
            ps.setBoolean(9, object.isHepatitis());
            ps.setInt(10, object.getDoctorId());
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
    public MedicalCard getById(int id) {
        return null;
    }

    @Override
    public void remove(int id) {

    }

    @Override
    public void update(MedicalCard object) {

    }
}
