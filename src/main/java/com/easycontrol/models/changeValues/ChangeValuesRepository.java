package com.easycontrol.models.changeValues;

import java.util.UUID;

import javax.persistence.EntityManager;

import com.easycontrol.models.abstracts.AbstractDAO;

import org.springframework.stereotype.Repository;

@Repository
public class ChangeValuesRepository extends AbstractDAO<ChangeValues, UUID> {

    public ChangeValuesRepository(EntityManager em) {
        super(em);
    }

}