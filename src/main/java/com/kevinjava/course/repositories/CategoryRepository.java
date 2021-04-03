package com.kevinjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
 
	
}
