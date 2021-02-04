package com.example.app.repository;

import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Produit;
import com.example.app.model.Stock;

public interface ProduitRepository extends JpaRepository<Produit, Integer> {
	Produit findByReference(String ref);

	}