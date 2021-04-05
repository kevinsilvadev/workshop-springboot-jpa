package com.kevinjava.course.entities;

import java.io.Serializable;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Table;

import com.kevinjava.course.entities.pk.OrderItemPK;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name="tb_order_item")
@NoArgsConstructor 
@EqualsAndHashCode(exclude = "id")
public class OrderItem implements Serializable {

	@Getter private static final long serialVersionUID = 1L;

	@EmbeddedId
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Getter @Setter private OrderItemPK id;
	
	@Getter @Setter private Integer quantity;
	@Getter @Setter private Double price;
	
	public Order getOrder() {
		return id.getOrder();
	}
	
	public void setOrder(Order order) {
		id.setOrder(order);
	}
	
	public Product getProduct() {
		return id.getProduct();
	}
	
	public void setProduct(Product product) {
		 id.setProduct(product);
	}
	
	public OrderItem(Order order, Product product, Integer quantity, Double price) {
		super();
		id.setOrder(order);
		id.setProduct(product);
		this.quantity = quantity;
		this.price = price;
	}

}
