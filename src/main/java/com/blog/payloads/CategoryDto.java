package com.blog.payloads;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class CategoryDto {
	
	
	private Integer categoryId;
	@NotBlank
	@Size(min=5, message = "Minimum 5 characters are allowed..")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=5, max=100, message = "Description should be between 5 to 100 characters..")
	private String categoryDescription;
	
}
