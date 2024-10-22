package com.js.controller;

import java.util.List;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class GetAllProducts {
	public static void main(String[] args) {
		ProductCRUD pc = new ProductCRUD();
		List<Product> products = pc.getAllProducts();
		
		if (products.size()>0) {
			for (Product p : products) {
				System.out.println(p);
				System.out.println("========================================");
			}
		} else {
              System.out.println("No Products Available");
		}
	}

}
