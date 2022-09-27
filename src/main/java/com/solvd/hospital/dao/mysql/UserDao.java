package com.solvd.hospital.dao.mysql;

import com.solvd.hospital.models.Allergy;
import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import com.solvd.hospital.dao.IUserDao;
import com.solvd.hospital.models.User;
import com.solvd.hospital.сonnectionpool.ConnectionPool;

public class UserDao extends AbstractMySqlDao implements IUserDao {

    private static final Logger LOGGER = LogManager.getLogger(UserDao.class);

    @Override
    public void create(User object) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        String query = "INSERT INTO Users(login, password, name, surname, middle_name, role) Values (?, ?, ?, ?, ?, ?)";
        try (PreparedStatement ps = connection.prepareStatement(query)){
            ps.setString(1,object.getLogin());
            ps.setString(2,object.getPassword());
            ps.setString(3,object.getName());
            ps.setString(4,object.getSurname());
            ps.setString(5,object.getMiddleName());
            ps.setInt(6, object.getRole());
            ps.execute();
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
    }

    @Override
    public User getById(int id) {
        Connection connection = ConnectionPool.getInstance().getConnection();
        try (PreparedStatement ps = connection.prepareStatement("Select id, login, password, name, surname, " +
                        "middle_name, role From Users " + "Where id = ?")) {
            ps.setInt(1,id);
            ResultSet rs = ps.executeQuery();
            User user = new User();
            while (rs.next()) {
                user.setId(rs.getInt("id"));
                user.setLogin(rs.getString("login"));
                user.setPassword(rs.getString("password"));
                user.setName(rs.getString("name"));
                user.setSurname(rs.getString("surname"));
                user.setMiddleName(rs.getString("middle_name"));
                user.setRole(rs.getInt("role"));
            }
            rs.close();
            return user;
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
    public void update(User object) {

    }

    @Override
    public List<User> getUsers() {
        return null;
    }
}
