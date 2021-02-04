package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.CommandeEnLigne;


public interface CommandeRepository extends JpaRepository<CommandeEnLigne, Integer> {

	}