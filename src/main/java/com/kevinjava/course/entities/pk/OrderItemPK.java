package com.kevinjava.course.entities.pk;

import java.io.Serializable;

import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.kevinjava.course.entities.Order;
import com.kevinjava.course.entities.Product;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Embeddable
@EqualsAndHashCode
public class OrderItemPK  implements Serializable {

	@Getter private static final long serialVersionUID = 1L;
	
	@ManyToOne
	@JoinColumn(name = "order_id")
	@Getter @Setter private Order order;
	
	@ManyToOne
	@JoinColumn(name = "product_id")
	@Getter @Setter private Product product;
}
