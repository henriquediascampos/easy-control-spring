package com.easycontrol.models.balance;

import java.util.List;

import javax.persistence.EntityManager;

import com.easycontrol.models.abstracts.AbstractDAO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository

public class BalanceDAO extends AbstractDAO<Balance, Long> {

    @Autowired
    public BalanceDAO(EntityManager em) {
        super(em);
    }

	public List<BalanceDTO> findBalanceCurrentMonth() {
        return createQuery("bala")
            // .join
            .getResultList();
	}

}