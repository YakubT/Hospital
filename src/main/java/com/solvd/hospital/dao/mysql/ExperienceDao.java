package com.solvd.hospital.dao.mysql;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.solvd.hospital.dao.IExperienceDao;
import com.solvd.hospital.models.Experience;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class ExperienceDao extends  AbstractMySqlDao implements IExperienceDao {

    private static final Logger LOGGER = LogManager.getLogger(ExperienceDao.class);

    @Override
    public void create(Experience object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Insert into Experiences (description, count_years, specialist_id) values ('"+object.getDescription()
                +"', "+ object.getCountYears()+", "+object.getSpecialistId()+")";
        try (PreparedStatement ps = connection.prepareStatement(query)){
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
    public Experience getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement("Select id, description, count_years, specialist_id " +
                "From Experiences " + "Where id = ?")) {
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
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Delete From Experiences where id = ?";
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
    public void update(Experience object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "Update Experiences Set description = ?, count_years = ?, specialist_id = ? Where id = ?";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,object.getDescription());
            ps.setInt(2,object.getCountYears());
            ps.setInt(3,object.getSpecialistId());
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
        finally {
            ConnectionPool.getInstance().releaseConnection(connection);
        }
    }
}
