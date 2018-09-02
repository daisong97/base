package com.base.demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.base.entities.User;
import com.base.repository.UserRepository;

import ch.qos.logback.core.net.SyslogOutputStream;

@RunWith(SpringRunner.class)
@SpringBootTest
public class BaseApplicationTests {
	@Autowired
	private UserRepository userRepository;
	@Test
	public void testJpa() {
		Iterable<User> findAll = userRepository.findAll();
		System.out.println(findAll);
		
	}

}
