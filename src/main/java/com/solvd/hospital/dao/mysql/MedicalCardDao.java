package com.solvd.hospital.dao.mysql;

import com.solvd.hospital.models.enums.BloodGroup;
import com.solvd.hospital.models.enums.Gender;
import com.solvd.hospital.models.enums.Invalidity;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solvd.hospital.dao.IMedicalCardDao;
import com.solvd.hospital.models.MedicalCard;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class MedicalCardDao extends AbstractMySqlDao implements IMedicalCardDao {

    private static final Logger LOGGER = LogManager.getLogger(MedicalCardDao.class);
    @Override
    public void create(MedicalCard object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Insert into Medical_Cards (patient_id, date_of_birth, gender, address, phone_number, invalidity" +
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
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement("Select id, patient_id, date_of_birth, gender , " +
                "address, phone_number, invalidity, blood_group, diabetes, hepatitis, doctor_id " +
                "From Medical_cards " + "Where id = ?")) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            MedicalCard medicalCard = new MedicalCard();
            while (rs.next()) {
                medicalCard.setId(rs.getInt("id"));
                medicalCard.setPatientId(rs.getInt("patient_id"));
                medicalCard.setDateOfBirth(rs.getDate("date_of_birth"));
                medicalCard.setGender(Gender.findByValue(rs.getString("gender")));
                medicalCard.setAddress(rs.getString("address"));
                medicalCard.setPhoneNumber(rs.getString("phone_number"));
                medicalCard.setInvalidity(Invalidity.findByValue(rs.getString("invalidity")));
                medicalCard.setBloodGroup(BloodGroup.findByValue(rs.getString("blood_group")));
                medicalCard.setDiabetes(rs.getBoolean("diabetes"));
                medicalCard.setHepatitis(rs.getBoolean("hepatitis"));
                medicalCard.setDoctorId(rs.getInt("doctor_id"));
            }
            rs.close();
            return medicalCard;
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
        String query = "Delete from Medical_cards where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,id);
            ps.execute();
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }

    }

    @Override
    public void update(MedicalCard object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Update Medical_cards SET id = ?, patient_id = ?, date_of_birth = ?, gender = ?, address = ?, " +
                "phone_number = ?, invalidity = ?, blood_group = ?, diabetes = ?, hepatitis = ?, doctor_id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)) {
            ps.setInt(1,object.getId());
            ps.setInt(2,object.getPatientId());
            ps.setDate(3, (Date) object.getDateOfBirth());
            ps.setString(4, object.getGender().getValue());
            ps.setString(5,object.getAddress());
            ps.setString(6,object.getPhoneNumber());
            ps.setString(7,object.getInvalidity().getValue());
            ps.setString(8, object.getBloodGroup().getValue());
            ps.setBoolean(9, object.isDiabetes());
            ps.setBoolean(10, object.isHepatitis());
            ps.setInt(11,object.getDoctorId());
            ps.execute();
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
    }
}
