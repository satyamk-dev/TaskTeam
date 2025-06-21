package com.nt.ProductController;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.nt.ProductEntity.Product;
import com.nt.ProductService.ProductService;

@Controller
public class ProductController {
	
	@Autowired
	private ProductService ps;
	
	public String insertCotro(Product product) {
		System.out.println("ProductController.fetchAll()");
		return ps.insertProduct(product);
		
	}
	
	

}
