package com.tbf.myfirtproject.resouces;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tbf.myfirtproject.entities.Product;
import com.tbf.myfirtproject.repositories.ProductRepository;

@RestController
@RequestMapping("/products")
public class ProductResource {
	
	@Autowired
	private ProductRepository Productrepository;
	
	@GetMapping
	public ResponseEntity<List<Product>> findAll(){
		List<Product> list = Productrepository.findAll();
		return ResponseEntity.ok().body(list);
	}
      @GetMapping(value = "/{id}")
	  public ResponseEntity<Product> findBuId(@PathVariable Long id){
		Product cat = Productrepository.findById(id);
		return ResponseEntity.ok().body(cat);
	}
}
