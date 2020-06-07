package com.easycontrol.models.changeValues;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class ChangeValuesController {

    @Autowired ChangeValuesService changeValuesService;

    @GetMapping(path = "/changeValues/teste")
    public String teste() {
        return "online";
    }

    @PostMapping(path = "/changeValues/input")
    public void input(ChangeValues changeValues) {
        changeValuesService.save(changeValues);
    }
}