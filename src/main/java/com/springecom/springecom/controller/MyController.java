package com.springecom.springecom.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.springecom.springecom.entities.Categories;
import com.springecom.springecom.services.CategoryService;


@RestController
public class MyController {
	
	
	
	
	@Autowired
	private CategoryService categoryService;

	@GetMapping("/home")
	public String home() {
		return "Welcome to Login Page";
	}
	
	//To get the categories
	@GetMapping("/categories")
	public List<Categories> getCategories()
	{
		return this.categoryService.getCategories();
	
	}
	
	@GetMapping("courses/{categoryId}")
	public Categories getCategory(@PathVariable String categoryId)
	{
		return this.categoryService.getCategory(Long.parseLong(categoryId));
	}
	
}
