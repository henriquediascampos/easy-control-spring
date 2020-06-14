package com.easycontrol.models.session;

import com.easycontrol.models.user.User;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class SessionController {
    
    @Autowired
    private SessionService sessionService;

    @PostMapping(path = "/login")
    public @ResponseBody Session login(User user) {
        return sessionService.login(user);
    }
}