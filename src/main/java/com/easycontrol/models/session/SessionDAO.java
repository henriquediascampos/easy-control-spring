package com.easycontrol.models.session;

import javax.persistence.EntityManager;

import com.easycontrol.models.abstracts.AbstractDAO;

import org.springframework.stereotype.Repository;

@Repository
public class SessionDAO extends AbstractDAO<Session, Long> {

    public SessionDAO(EntityManager em) {
        super(em);
    }


}