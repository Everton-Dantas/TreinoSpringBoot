package com.tbf.myfirtproject.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbf.myfirtproject.entities.Category;
import com.tbf.myfirtproject.repositories.CategoryRepository;

@RestController
@RequestMapping("/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryRepository categoryrepository;
	
	@GetMapping
	public ResponseEntity<List<Category>> findAll(){
		List<Category> list = categoryrepository.findAll();
		return ResponseEntity.ok().body(list);
	}
      @GetMapping(value = "/{id}")
	  public ResponseEntity<Category> findBuId(@PathVariable Long id){
		Category cat = categoryrepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
