package com.solvd.hospital.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ConnectionPool {

    private  String url;

    private String user;

    private String password;

    private List<Connection> pool;

    private List<Connection> usedConnections;

    private final static int INITIAL_POOL_SIZE = 10;

    private static ConnectionPool instance;

    private ConnectionPool() {};

    public void create (String url, String user, String password) throws SQLException {
        pool = new ArrayList<>(INITIAL_POOL_SIZE);
        usedConnections = new ArrayList<>();
        for (int i=0;i<INITIAL_POOL_SIZE;i++) {
            pool.add(createConnection(url,user,password));
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
    private static Connection createConnection(String url, String user, String password) throws SQLException {
        return DriverManager.getConnection(url,user,password);
    }

}
