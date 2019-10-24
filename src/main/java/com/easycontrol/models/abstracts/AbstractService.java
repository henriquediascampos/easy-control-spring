package com.easycontrol.models.abstracts;

public abstract interface AbstractService <T, ID> {
    T save(T entity);
}
