package com.easycontrol.models.changeValues;

import java.util.UUID;

import com.easycontrol.models.abstracts.AbstractService;
import com.easycontrol.models.balance.Balance;
import com.easycontrol.models.user.UserRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ChangeValuesService extends AbstractService<ChangeValues, UUID> {

    @Autowired private ChangeValuesRepository changeValuesRepository;
    // @Autowired BalanceService balanceService;
    @Autowired UserRepository userRepository;


    public ChangeValues save(ChangeValues entity) {
        // Balance balance = balanceService.findLastItem();
        // balance.
        Balance balance = new Balance(); 
        balance.setChangeValues(entity);
        return changeValuesRepository.save(entity);
    }

}