package com.easycontrol.models.user;

import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired UserService userService;

    @PostMapping(path = "/user" )
    public @ResponseBody User teste(@RequestBody User user) {
        System.out.println(user.toString());
        User user_ = new User();
        user_.setName("name");
        user_.setEmail("email");
        user_.setPassword("password");
        user_.setLastName("lastName");
        user_.setExclude(false);
        user_.setCreatedAt(ZonedDateTime.now(ZoneOffset.ofHours(-3)));
        return userService.save(user_);
    }

    @GetMapping(path = "/teste")
    public String teste() {
        return "online";
    }
}