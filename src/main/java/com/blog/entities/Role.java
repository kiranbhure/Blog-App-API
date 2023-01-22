package com.blog.entities;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import lombok.Data;

@Entity
@Data
public class Role {
	
	@Id
	private int id;
	
	private String name;
	
	@ManyToMany(mappedBy = "roles", cascade = CascadeType.ALL)
	private Set<User> users = new HashSet<>();
	
}
