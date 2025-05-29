package com.tubes.dashboard_app;

import com.tubes.dashboard_app.models.User;
import com.tubes.dashboard_app.models.Client;
import com.tubes.dashboard_app.repositories.UserRepository;
import com.tubes.dashboard_app.services.User.UserService;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DashboardAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(DashboardAppApplication.class, args);
	}
}
