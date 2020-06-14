package com.easycontrol.models.user;

import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Controller
public class UserController {

    @Autowired UserService userService;

    @GetMapping(path = "/")
    public @ResponseBody String barra() {
        return "serviço online";
    }

    @PostMapping(path = "/user/save" )
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
    public @ResponseBody List<UserDto> teste() {
        User user_ = new User();
        user_.setName("name");
        user_.setEmail("email");
        user_.setPassword("password");
        user_.setLastName("lastName");
        user_.setExclude(false);
        user_.setCreatedAt(ZonedDateTime.now(ZoneOffset.ofHours(-3)));
        userService.save(user_);

        List<UserDto> teste = userService.teste("teste");
        return teste;
    }

    @GetMapping(path = "/user/teste2")
    public @ResponseBody Stream<User> teste2() {
        User user_ = new User();
        user_.setName("name");
        user_.setEmail("email");
        user_.setPassword("password");
        user_.setLastName("lastName");
        user_.setExclude(false);
        user_.setCreatedAt(ZonedDateTime.now(ZoneOffset.ofHours(-3)));
        userService.save(user_);

        PageRequest pageRequest = PageRequest.of(10,10,Sort.Direction.ASC,"name");

        Page<User> teste = userService.search("name", pageRequest);
        Stream<User> a = teste.get();
        List<User> b =  a.collect(Collectors.toList());
        return a;
    }
}