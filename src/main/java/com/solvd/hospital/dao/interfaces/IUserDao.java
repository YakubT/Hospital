package com.solvd.hospital.dao.interfaces;

import java.util.List;

import com.solvd.hospital.models.classes.User;

public interface IUserDao extends IBaseDao<User> {
    public List<User> getUsers();
}
