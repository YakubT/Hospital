package com.solvd.hospital.dao.mysql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solvd.hospital.dao.IAllergyDao;
import com.solvd.hospital.сonnectionpool.ConnectionPool;
import com.solvd.hospital.models.Allergy;

public class AllergyDao extends AbstractMySqlDao implements IAllergyDao {

    private static final Logger LOGGER = LogManager.getLogger(AllergyDao.class);
    @Override
    public void create(Allergy object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Insert into Allergies(name_of_drug, Medical_card_id) values ('"+object.getNameOfDrug()+"', "+
                object.getMedicalCardId()+" )";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }

    }

    @Override
    public Allergy getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement("Select id, name_of_drug, Medical_card_id " +
                "From Allergies " + "Where id = ?")) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            Allergy allergy = new Allergy();
            while (rs.next()) {
                allergy.setId(rs.getInt("id"));
                allergy.setMedicalCardId(rs.getInt("Medical_card_id"));
                allergy.setNameOfDrug(rs.getString("name_of_drug"));
            }
            rs.close();
            return allergy;
        }
        catch (SQLException e){
            LOGGER.error(e);
        }
        return null;
    }

    @Override
    public void remove(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Delete From Allergies where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setInt(1,id);
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
    }

    @Override
    public void update(Allergy object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Update Allergies Set name_of_drug = ?, medical_card_id = ? Where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,object.getNameOfDrug());
            ps.setInt(2,object.getMedicalCardId());
            ps.setInt(3,object.getId());
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
    }
}
