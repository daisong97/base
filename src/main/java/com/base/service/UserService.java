package com.base.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.base.entities.User;
import com.base.repository.UserRepository;

@Service
public class UserService {
	@Autowired
	UserRepository userRepository;
	public User findUserByUserName(String name) {
		List<User> users = userRepository.findByUserName(name);
		return users.isEmpty() ? null : users.get(0);
	}
}
