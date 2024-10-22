package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class InsertProduct {
	public static void main(String[] args) {
		Product p = new Product();
		p.setName("Clogs");
		p.setBrand("Crocs");
		p.setPrice(5000);
		p.setQuantity(30);
		
		ProductCRUD pc = new ProductCRUD();
		if (pc.insertProduct(p)) {
			System.out.println("Inserted Successfully");
		} else {
           System.out.println("Failed to Insert");
		}
	}

}
