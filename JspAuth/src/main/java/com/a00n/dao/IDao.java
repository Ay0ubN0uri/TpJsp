package com.a00n.dao;

import java.util.List;

/**
 *
 * @author ay0ub
 */
public interface IDao<T> {

    boolean create(T o);

    boolean delete(T o);

    boolean update(T o);

    T getById(int id);

    List<T> getAll();

}
