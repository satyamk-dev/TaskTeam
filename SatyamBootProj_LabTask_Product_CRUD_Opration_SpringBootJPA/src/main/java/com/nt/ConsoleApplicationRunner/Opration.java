package com.nt.ConsoleApplicationRunner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.nt.ProductController.ProductController;
import com.nt.ProductEntity.Product;

@Component
public class Opration implements CommandLineRunner {

	@Autowired
	private ProductController pc;
	
	@Override
	public void run(String... args) throws Exception {
	try {
		
		Product p = new Product();
		
		p.setProductName("HP Laptop");
		p.setDescription("8 Gb RAM , 1Tb SSD, i9 core, 4Gb GC");
		p.setPrice(90000.0);
		
		String msg = pc.insertCotro(p);
		
		System.out.println(msg);
		
	}catch(Exception e){
		e.printStackTrace();
	}
		


	}

}
