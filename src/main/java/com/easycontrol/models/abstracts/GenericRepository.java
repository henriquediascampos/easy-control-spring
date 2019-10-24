package com.easycontrol.models.abstracts;

import java.time.ZoneId;
import java.time.ZonedDateTime;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

@Transactional
public class GenericRepository<T extends AbstractEntity, ID>  {

    protected EntityManager em;
    public GenericRepository(EntityManager em) {
        this.em = em;
    }

    public T save(T entity) {
        entity.setCreatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        entity.setExclude(false);
        T t  = em.merge(entity);
        return t;
    }

}
