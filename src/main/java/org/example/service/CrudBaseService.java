package org.example.service;

import org.example.model.EntityBase;
import org.example.repo.BaseRepository;


import java.util.List;
import java.util.Optional;

public abstract class CrudBaseService<T extends EntityBase> implements IBaseService<T> {
    public abstract BaseRepository<T> getRepository();



    public T save(T t) {
        return getRepository().save(t);
    }

    public void delete(Long id) {
        getRepository().deleteById(id);
    }

    public Optional<T> findById(Long id) {
        return getRepository().findById(id);
    }

    public List<T> findAll() {
        return getRepository().findAll();
    }
}
