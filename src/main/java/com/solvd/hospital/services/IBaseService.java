package com.solvd.hospital.services;

public interface IBaseService<T> {

    void create(T object);

    T getById(int id);

    void remove (int id);

    void update (T object);
}
