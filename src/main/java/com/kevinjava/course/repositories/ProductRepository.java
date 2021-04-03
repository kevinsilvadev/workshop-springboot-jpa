package com.kevinjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
 
	
}
