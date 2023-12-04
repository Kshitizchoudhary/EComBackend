package com.springecom.springecom.services;

import java.util.List;
import com.springecom.springecom.entities.Categories;

public interface CategoryService {

	
	public List <Categories> getCategories();
	
	public Categories getCategory(long categoryId);
	
}
