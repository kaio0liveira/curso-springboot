package com.example.course.config;

import java.time.Instant;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.example.course.entities.Order;
import com.example.course.entities.User;
import com.example.course.repositories.OrderRepository;
import com.example.course.repositories.UserRepository;


@Configuration
@Profile("test")
public class TesteConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	@Autowired
	private OrderRepository orderRepository;

	@Override
	public void run(String... args) throws Exception {
	
		User user1 = new User(null, "Kaio", "kaio@gmail.com", "87878787", "12345");
		
		Order o1 = new Order(null, Instant.parse("2019-06-20T19:53:07Z"), user1);

		
		userRepository.saveAll(Arrays.asList(user1));
		orderRepository.saveAll(Arrays.asList(o1));
	}
	
	
	
}
