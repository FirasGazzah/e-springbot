package com.example.app.repository;


import java.util.List;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Stock;

public interface StockRepository extends JpaRepository<Stock, Integer> {
	List<Stock> findByMagasinId(int id);
	List<Stock> findByMagasinIdAndQuantiterGreaterThan(int id,int qte);
	Page<Stock> findByProduitProduitsReferenceAndMagasinId(String ref, int id, Pageable pageable);
	List<Stock> findByProduitProduitsReferenceStartsWithAndMagasinId(String start, int id);

	}