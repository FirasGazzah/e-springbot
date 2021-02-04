package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Produits;

public interface ProduitsRepository extends JpaRepository<Produits, Integer> {

	}