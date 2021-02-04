package com.example.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.*;

import com.example.app.model.Stock;
import com.example.app.repository.StockRepository;


@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/api/stock")
public class StockController {

	@Autowired
	StockRepository stockRepository;
	
	  @GetMapping("/all")
	  public List<Stock> getAllProduit() {
	      return stockRepository.findAll();
	 
	  }
	  
//	  @GetMapping("/{id}")
//	  public List<Stock> getStockByMagasinId(@PathVariable int id) {
//	      return stockRepository.findByMagasinId(id);
//	 
//	  }
	  
	  @GetMapping("/{id}")
	  public List<Stock> getStockByMagasinId(@PathVariable int id) {
	      return stockRepository.findByMagasinIdAndQuantiterGreaterThan(id,0);
	 
	  }
	  
	  @GetMapping("/reference/{ref}")
	  public Page<Stock> getStockByReference(@PathVariable String ref, Pageable pageable) {
	      return stockRepository.findByProduitProduitsReferenceAndMagasinId(ref,1, pageable);
	 
	  }
	  
	  @GetMapping("/colors/{start}")
	  public List<Stock> getStockByColors(@PathVariable String start) {
	      return stockRepository.findByProduitProduitsReferenceStartsWithAndMagasinId(start,1);
	 
	  }
	  
	  
//	  @GetMapping("/fournisseur/{id}")
//	  public Optional<Fournisseur> getProviderById(@PathVariable int id) {
//	      return fournisseurRepository.findById(id);
//	 
//	  }
//	  
//	  
//	  @PostMapping("/fournisseur")
//	  public ResponseEntity<Fournisseur> createSubCategory(@RequestBody Fournisseur depense) {
//	    try {
//	    	Fournisseur _depense = fournisseurRepository
//	          .save(depense);
//	      return new ResponseEntity<>(_depense, HttpStatus.CREATED);
//	    } catch (Exception e) {
//	      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
//	    }
//	  }

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