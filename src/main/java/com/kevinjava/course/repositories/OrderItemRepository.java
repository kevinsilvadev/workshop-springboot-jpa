package com.kevinjava.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kevinjava.course.entities.OrderItem;
import com.kevinjava.course.entities.pk.OrderItemPK;

public interface OrderItemRepository extends JpaRepository<OrderItem, OrderItemPK> {
 
	
	
}
