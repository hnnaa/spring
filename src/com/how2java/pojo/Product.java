package com.how2java.pojo;

import org.springframework.beans.factory.annotation.Autowired;

public class Product {
	private String name;
	@Autowired
	private Category category;

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Category getCategory() {
		return this.category;
	}
}
