package com.easycontrol.models.balance;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class BalanceController {

    @Autowired private BalanceService balanceService;

    @GetMapping(path = "/balance/teste")
    public String teste() {
        return "online";
    }

    @GetMapping(path = "/balance/findBalanceCurrentMonth")
    public  @ResponseBody List<BalanceDTO> findBalanceCurrentMonth() {
        return balanceService.findBalanceCurrentMonth();
    }
}