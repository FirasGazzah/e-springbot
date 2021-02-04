package com.example.app.controller;

import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import com.example.app.model.Client;
import com.example.app.model.CommandeEnLigne;
import com.example.app.model.CommandeEnLigne_Produits;
import com.example.app.model.Produit;
import com.example.app.repository.ClientRepository;
import com.example.app.repository.CommandeEnLigneProduitsRepository;
import com.example.app.repository.CommandeRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/commande")
public class CommandeController {

	@Autowired
	CommandeRepository commandeRepository;
	@Autowired
	ClientRepository clientRepository;
	@Autowired
	CommandeEnLigneProduitsRepository commandeEnLigneProduitsRepository;
	
	  @GetMapping("/")
	  public List<CommandeEnLigne> getAllProduit() {
	      return commandeRepository.findAll();
	 
	  }
	  
	  @GetMapping("/{id}")
	  public ResponseEntity<CommandeEnLigne> getTutorialById(@PathVariable("id") int id) {
	    Optional<CommandeEnLigne> cmdData = commandeRepository.findById(id);

	    if (cmdData.isPresent()) {
	      return new ResponseEntity<>(cmdData.get(), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
	  
	  
	  @PostMapping("/create")
	  public ResponseEntity<CommandeEnLigne> createSubCategory(@RequestBody CommandeEnLigne cmd) {
		  Client exist = clientRepository.findByTel(cmd.getNum());
		 System.out.println(exist + "exiit");
  		if(exist == null ) {
  			exist.setTel(cmd.getNum());
  			exist.setNom(cmd.getNom());
  			exist.setCountry(cmd.getPays());
  			exist.setState(cmd.getGouvern());
			clientRepository.save(exist);
		}
  			cmd.setClient(exist);
	    	cmd.setDate(new Date());
	    	CommandeEnLigne _cmd = commandeRepository
	          .save(cmd);
	    	for(CommandeEnLigne_Produits tha : cmd.getCmdP()) { 
				
				tha.setCmdLigne(cmd);
				commandeEnLigneProduitsRepository.save(tha);
			    
			}
	      return new ResponseEntity<>(_cmd, HttpStatus.CREATED);
	  
	  }

//	  @GetMapping("/tutorials/{id}")
//	  public ResponseEntity<Tutorial> getTutorialById(@PathVariable("id") long id) {
//	    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
//
//	    if (tutorialData.isPresent()) {
//	      return new ResponseEntity<>(tutorialData.get(), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
//
//	  @PostMapping("/tutorials")
//	  public ResponseEntity<Tutorial> createTutorial(@RequestBody Tutorial tutorial) {
//	    try {
//	      Tutorial _tutorial = tutorialRepository
//	          .save(new Tutorial(tutorial.getTitle(), tutorial.getDescription(), false));
//	      return new ResponseEntity<>(_tutorial, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//
//	  @PutMapping("/tutorials/{id}")
//	  public ResponseEntity<Tutorial> updateTutorial(@PathVariable("id") long id, @RequestBody Tutorial tutorial) {
//	    Optional<Tutorial> tutorialData = tutorialRepository.findById(id);
//
//	    if (tutorialData.isPresent()) {
//	      Tutorial _tutorial = tutorialData.get();
//	      _tutorial.setTitle(tutorial.getTitle());
//	      _tutorial.setDescription(tutorial.getDescription());
//	      _tutorial.setPublished(tutorial.isPublished());
//	      return new ResponseEntity<>(tutorialRepository.save(_tutorial), HttpStatus.OK);
//	    } else {
//	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
//	    }
//	  }
//
//	  @DeleteMapping("/tutorials/{id}")
//	  public ResponseEntity<HttpStatus> deleteTutorial(@PathVariable("id") long id) {
//	    try {
//	      tutorialRepository.deleteById(id);
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }
//
//	  @DeleteMapping("/tutorials")
//	  public ResponseEntity<HttpStatus> deleteAllTutorials() {
//	    try {
//	      tutorialRepository.deleteAll();
//	      return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//
//	  }
//
//	  @GetMapping("/tutorials/published")
//	  public ResponseEntity<List<Tutorial>> findByPublished() {
//	    try {
//	      List<Tutorial> tutorials = tutorialRepository.findByPublished(true);
//
//	      if (tutorials.isEmpty()) {
//	        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
//	      }
//	      return new ResponseEntity<>(tutorials, HttpStatus.OK);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }

	}