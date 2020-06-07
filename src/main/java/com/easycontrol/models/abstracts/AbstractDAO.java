package com.easycontrol.models.abstracts;

import java.lang.reflect.ParameterizedType;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.UUID;
import javax.transaction.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.Query;


@Transactional
public abstract class AbstractDAO<T extends AbstractEntity, ID> {

    protected EntityManager em; 
    private final Class<T> clazz;

    @SuppressWarnings("unchecked")
    public AbstractDAO(final EntityManager em) {
        this.em = em;
        this.clazz = (Class<T>) ((ParameterizedType) this.getClass().getGenericSuperclass()).getActualTypeArguments()[0];
    }

    public T save(final T entity) {
        entity.setCreatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        entity.setExclude(false);
        em.persist(entity);
        return entity;
    }

    public T merge(final T entity) {
        return em.merge(entity);
    }

    public T update(final T entity) {
        entity.setUpdatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        return em.merge(entity);
    }

    public void remove(final T entity) {
        entity.setUpdatedAt(ZonedDateTime.now(ZoneId.systemDefault()));
        entity.setExclude(true);
        em.persist(entity);
    }

    public T findById(final UUID uuid) {
        return em.find(clazz, uuid);
	}

    @SuppressWarnings("unchecked")
    public List<T> findAll() {
        return em.createQuery("select * from " + clazz.getSimpleName()).getResultList();
    }
    
    public Query createQuery(String alias) {
        return em.createQuery(clazz.getSimpleName() + " " + alias);
    }

}
