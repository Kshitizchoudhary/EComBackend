package com.springecom.springecom.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale.Category;

import org.springframework.stereotype.Service;

import com.springecom.springecom.entities.Categories;

@Service
public class CategoryServiceImpl implements CategoryService {

	
	List<Categories> list;
	
	public CategoryServiceImpl() {
		list = new  ArrayList<>();
		list.add(new Categories(145,  "Java Course", "this couse contains basics"));
		list.add(new Categories(146,  "Python Course", "this couse contains advancce"));
	}
	
	
	
	
	@Override
	public List<Categories> getCategories() {
		// TODO Auto-generated method stub
		return list;
	}




	@Override
	public Categories getCategory(long categoryId) {
		Categories c =null;
		
		for(Categories category:list)
		{
			if (Categories.getId() == categoryId)
			{
				c=category;
				break;
			}
		}
		return c;
	}

	
	}


