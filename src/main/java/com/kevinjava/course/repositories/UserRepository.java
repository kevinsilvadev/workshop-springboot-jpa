package com.kevinjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {
 
	
	
}
