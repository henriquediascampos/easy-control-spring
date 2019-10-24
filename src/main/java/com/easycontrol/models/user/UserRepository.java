package com.easycontrol.models.user;

import java.util.UUID;

import javax.persistence.EntityManager;

import com.easycontrol.models.abstracts.GenericRepository;

import org.springframework.stereotype.Repository;

@Repository
public class UserRepository extends GenericRepository<User, UUID> {

    public UserRepository(EntityManager entityManager) {
        super(entityManager);
    }


}