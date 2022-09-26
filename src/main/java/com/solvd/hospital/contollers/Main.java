package com.solvd.hospital.contollers;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import com.solvd.hospital.dao.ConnectionPool;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {

    private static final Logger LOGGER = LogManager.getLogger(Main.class);

    public static void main (String[] args) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e) {
            System.out.println(e);
        }
        ConnectionPool connectionPool = ConnectionPool.getInstance();
        Connection connection;
        try {
            connectionPool.create();
            connection = connectionPool.getConnection();
            Statement statement;
            statement = connection.createStatement();
            ResultSet resultSet;
            resultSet = statement.executeQuery("select * from users");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                System.out.println(id);
                System.out.println(resultSet.getString("name"));
            }
            statement.close();
            resultSet.close();
            connectionPool.releaseConnection(connection);
        }
        catch (SQLException e){
            System.out.println(e);
        }
        finally {
            connectionPool.shutdown();
        }
    }
}
