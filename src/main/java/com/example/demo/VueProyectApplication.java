package com.example.demo;

import com.example.demo.models.Role;
import com.example.demo.models.User;
import com.example.demo.services.impl.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.factory.PasswordEncoderFactories;
import org.springframework.security.crypto.password.PasswordEncoder;

import java.util.ArrayList;

@SpringBootApplication
public class VueProyectApplication {

	public static void main(String[] args) {
		SpringApplication.run(VueProyectApplication.class, args);
	}

	@Bean
	PasswordEncoder passwordEncoder() {
		return PasswordEncoderFactories.createDelegatingPasswordEncoder();
	}

	@Bean
	CommandLineRunner run(UserService userService) {
		return args -> {
			userService.saveRole(new Role(null, "ROLE_USER"));
			userService.saveRole(new Role(null, "ROLE_ADMIN"));

			userService.saveUser(new User(null, "Fran Revi", "fran", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Secundaria", "secundaria", "1234", new ArrayList<>()));
			userService.saveUser(new User(null, "Administrador", "admin", "admin", new ArrayList<>()));

			userService.addRoleToUser("fran", "ROLE_USER");
			userService.addRoleToUser("secundaria", "ROLE_USER");
			userService.addRoleToUser("admin", "ROLE_ADMIN");

		};
	}
}

