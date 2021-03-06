package com.easycontrol.models.balance;

import java.util.List;

import com.easycontrol.models.abstracts.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BalanceService extends AbstractService<Balance, Long> {

    @Autowired
    BalanceDAO balanceRepository;

    public Balance save(Balance entity) {
        return balanceRepository.save(entity);
    }

    public List<BalanceDTO> findBalanceCurrentMonth() {
        return balanceRepository.findBalanceCurrentMonth();
    }

}