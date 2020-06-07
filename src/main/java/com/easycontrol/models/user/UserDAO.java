package com.easycontrol.models.user;

import java.util.UUID;

import javax.persistence.EntityManager;

import com.easycontrol.models.abstracts.AbstractDAO;

import org.springframework.stereotype.Repository;

@Repository
public class UserDAO extends AbstractDAO<User, UUID> {

    public UserDAO(EntityManager em) {
        super(em);
    }


}