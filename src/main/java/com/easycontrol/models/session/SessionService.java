package com.easycontrol.models.session;

import java.util.UUID;

import com.easycontrol.models.abstracts.AbstractService;
import com.easycontrol.models.user.User;
import com.easycontrol.models.user.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SessionService extends AbstractService<User, Long> {

    @Autowired
    private SessionDAO sessionDAO;
    // @Autowired
    // private SessionRepository sessionRepository;
    @Autowired
    private UserService userService;

	public Session login(User user) {
        User user_ = userService.loginMatch(user);
        return createSession(user_);
	}

    private Session createSession(User user_) {
        Session session = new Session(UUID.randomUUID(), user_);
        return sessionDAO.save(session);
    }

}
