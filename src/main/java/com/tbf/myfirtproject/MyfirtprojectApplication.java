package com.tbf.myfirtproject;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.tbf.myfirtproject.entities.Category;
import com.tbf.myfirtproject.repositories.CategoryRepository;

@SpringBootApplication
public class MyfirtprojectApplication implements CommandLineRunner {

	@Autowired
	private CategoryRepository categoryrepository;
	
	
	
	
	public static void main(String[] args) {
		SpringApplication.run(MyfirtprojectApplication.class, args);
		
	}

	@Override
	public void run(String... args) throws Exception {
		Category cat1 = new Category(1L,"ELETRONICS");
		Category cat2 = new Category(2L,"BOOKS");
		
		categoryrepository.save(cat1);
		categoryrepository.save(cat2);
	}

}
