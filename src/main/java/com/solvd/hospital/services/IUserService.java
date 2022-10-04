package com.solvd.hospital.services;

import com.solvd.hospital.models.classes.User;

import java.util.List;

public interface IUserService extends IBaseService<User> {
    public List<User> getUsers();
}
