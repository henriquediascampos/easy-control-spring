package com.easycontrol.models.abstracts;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public abstract class AbstractService<T extends AbstractEntity, ID> {

    @Autowired private AbstractDAO<T, ID> abstractDAO;

    public T save(final T entity) {
        return (T) abstractDAO.save(entity);
    }

    public T findById(final UUID uuid) {
        return (T) abstractDAO.findById(uuid);
    }

    public List<T> findAll(){
        return abstractDAO.findAll();
    }
}
