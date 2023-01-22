package com.blog;


import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.blog.config.AppConstants;
import com.blog.entities.Role;
import com.blog.repository.RoleRepo;

@SpringBootApplication
public class BlogAppApiApplication implements CommandLineRunner {
	
	@Autowired
	private RoleRepo roleRepo;


	public static void main(String[] args) {
		SpringApplication.run(BlogAppApiApplication.class, args);
	}
	
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}

	@Override
	public void run(String... args) throws Exception {
		try {
			Role role = new Role();
			role.setId(AppConstants.ADMIN_USER);
			role.setName("ROLE_ADMIN");
			
			Role role2 = new Role();
			role2.setId(AppConstants.NORMAL_USER);
			role2.setName("ROLE_NORMAL");
			
			List<Role> roles = List.of(role, role2);
			this.roleRepo.saveAll(roles);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}

	

}
