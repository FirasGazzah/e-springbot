package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.CommandeEnLigne_Produits;


public interface CommandeEnLigneProduitsRepository extends JpaRepository<CommandeEnLigne_Produits, Integer> {

	}