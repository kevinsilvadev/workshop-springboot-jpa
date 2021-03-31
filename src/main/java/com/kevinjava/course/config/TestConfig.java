package com.kevinjava.course.config;



import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.kevinjava.course.entities.User;
import com.kevinjava.course.repositories.UserRepository;

@Configuration
@Profile("test")
public class TestConfig implements CommandLineRunner{
	
	@Autowired
	private UserRepository userRepository;

	@Override
	public void run(String... args) throws Exception {
		
		User u1 = new User(null, "Maria Brown", "maria@gmail.com", "988888888888", "12345");
		User u2 = new User(null, "Alex Green", "Alex@gmail.com", "9777777777", "12345678");
	
		userRepository.saveAll(Arrays.asList(u1,u2));
	}

}
