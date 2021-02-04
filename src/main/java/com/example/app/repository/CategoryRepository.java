package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Categories;


public interface CategoryRepository extends JpaRepository<Categories, Integer> {

	}