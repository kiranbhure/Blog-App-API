package com.blog.payloads;

import java.util.HashSet;
import java.util.Set;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.blog.entities.Role;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class UserDto {
	private int id;
	
	@NotEmpty
	@Size(min=3, message = "Name must have more than 3 characters..")
	private String name;
	
	@Email(regexp = "[a-z0-9._%+-]+@[a-z0-9.-]+\\.[a-z]{2,3}", message = "Invalid Email..")
	private String email;
	
	@NotEmpty(message = "Password field is required..")
	@Size(min=3, max=10, message = "Password must be between 3 to 10 characters..")
	private String password;
	
	@NotEmpty(message = "About field is required..")
	private String about;
	
	private Set<RoleDto> roles = new HashSet<>();
}
