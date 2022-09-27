package com.solvd.hospital.сonnectionpool;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

public class ConnectionPool {

    private  static final Logger LOGGER = LogManager.getLogger();

    private List<Connection> pool;

    private List<Connection> usedConnections;

    private final static int INITIAL_POOL_SIZE = 10;

    private static ConnectionPool instance;

    private ConnectionPool() {};

    public void create () throws SQLException {
        pool = new ArrayList<>(INITIAL_POOL_SIZE);
        usedConnections = new ArrayList<>();
        String url,user,password;
        url=user=password = null;
        Properties property = new Properties();
        try (FileInputStream fis = new FileInputStream("src/main/resources/db.properties")) {
            property.load(fis);
            url = property.getProperty("db.url");
            user = property.getProperty("db.user");
            password = property.getProperty("db.password");
        }
        catch (IOException e){
            LOGGER.error(e);
        }
        try {
        for (int i=0;i<INITIAL_POOL_SIZE;i++) {
                pool.add(createConnection(url, user, password));
            }
        }
        catch (SQLException e) {
            LOGGER.error(e);
        }
    }

    public static synchronized ConnectionPool getInstance() {
        if (instance==null) {
            instance = new ConnectionPool();
        }
        return instance;
    }

    public synchronized Connection getConnection() {
        Connection connection = pool.get(pool.size()-1);
        usedConnections.add(connection);
        pool.remove(connection);
        return connection;
    }

    public boolean releaseConnection(Connection connection) {
        boolean f = usedConnections.remove(connection);
        if (f) {
            pool.add(connection);
        }
        return f;
    }

    public int getCountOFFreeConnections() {
        return pool.size();
    }
    private Connection createConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

    public void shutdown() {
        for (Connection con:pool){
            try {
                con.close();
            }
            catch (SQLException e){
                LOGGER.error(e);
            }
        }
        for (Connection con:usedConnections){
            try {
                con.close();
            }
            catch (SQLException e){
                LOGGER.error(e);
            }
        }
        pool = null;
        usedConnections = null;
    }
}
