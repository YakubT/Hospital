package com.solvd.hospital.dao.mysql;

import org.apache.logging.log4j.Logger;
import org.apache.logging.log4j.LogManager;

public abstract class AbstractMySqlDao {
    private static final Logger LOGGER = LogManager.getLogger(AbstractMySqlDao.class);
    static {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        }
        catch (ClassNotFoundException e){
            LOGGER.error(e);
        }
    }
}
