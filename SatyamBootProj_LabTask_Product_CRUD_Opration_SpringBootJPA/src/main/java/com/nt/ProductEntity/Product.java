package com.nt.ProductEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Entity
@Table(name="Product_Table")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Product {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="Product_seq")
	@SequenceGenerator(name="Product_seq",sequenceName="product_sequence" , allocationSize=1)
	private Long productId;
	
	@Column(name="Product_Name",length=30)
	private String productName;
	@Column(name="Product_Description",length=50)
	private String description;
	@Column(name="Product_Price")
	private Double price;

}
