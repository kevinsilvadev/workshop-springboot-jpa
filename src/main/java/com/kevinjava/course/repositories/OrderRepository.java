package com.kevinjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
