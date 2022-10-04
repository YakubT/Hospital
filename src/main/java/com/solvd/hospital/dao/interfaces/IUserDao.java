package com.solvd.hospital.dao.interfaces;

import java.util.List;

import com.solvd.hospital.dao.interfaces.IBaseDao;
import com.solvd.hospital.models.User;

public interface IUserDao extends IBaseDao<User> {
    public List<User> getUsers();
}
