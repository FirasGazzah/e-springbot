package com.example.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.app.model.Client;



public interface ClientRepository extends JpaRepository<Client, Integer> {
	Client findByTel(String lastname);
	}