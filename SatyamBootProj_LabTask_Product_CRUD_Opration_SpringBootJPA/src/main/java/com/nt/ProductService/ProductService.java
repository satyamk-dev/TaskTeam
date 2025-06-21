package com.nt.ProductService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.ProductEntity.IProduct;
import com.nt.ProductEntity.Product;

@Service
public class ProductService implements IProductService {

	@Autowired
	private IProduct pe;
	
	@Override
	public String insertProduct(Product product) {
		System.out.println("ProductService.insertProduct()");
		
		Product sProduct = pe.save(product);
		
		Long pid = sProduct.getProductId();
		
		
		return "Data is Inserted "+ pid;
	
	}

}
