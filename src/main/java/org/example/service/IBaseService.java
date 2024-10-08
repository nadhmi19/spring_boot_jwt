package org.example.service;

import java.util.List;
import java.util.Optional;

public interface IBaseService<T>  {

    T save(T t);
    void delete(Long id);
    Optional<T> findById(Long id);
    List<T> findAll();
}
