package com.solvd.hospital.dao;

import java.util.List;

import com.solvd.hospital.models.User;

public interface IUserDao extends IBaseDao<User> {
    public List<User> getUsers();
}
