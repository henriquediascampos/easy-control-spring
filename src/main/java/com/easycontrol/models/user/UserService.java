package com.easycontrol.models.user;

import java.util.List;
import java.util.UUID;

import com.easycontrol.models.abstracts.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, UUID> {

    @Autowired private UserRepository userRepository;

	public List<UserDto> teste(String string) {
		return userRepository.teste(string);
	}

	public Page<User> search(String searchTerm, PageRequest pageable) {
		return userRepository.search(searchTerm, pageable);
	}

	public String login(User user) {
		if (loginMatch(user)) {
			String hash = "";
		}
		return "no match";
	}

	private boolean loginMatch(User user) {
		return userRepository.loginMatch(user.getEmail(), user.getPassword());
	}


}