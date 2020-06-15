package com.easycontrol.models.user;

import java.util.List;

import com.easycontrol.models.abstracts.AbstractService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;

@Service
public class UserService extends AbstractService<User, Long> {

    @Autowired private UserRepository userRepository;

	public List<UserDto> teste(String string) {
		return userRepository.teste(string);
	}

	public Page<User> search(String searchTerm, PageRequest pageable) {
		return userRepository.search(searchTerm, pageable);
	}

	public User loginMatch(User user) {
		return new User(); //userRepository.loginMatch(user.getEmail(), user.getPassword());
	}


}