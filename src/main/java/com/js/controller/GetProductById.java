package com.js.controller;

import com.js.dao.ProductCRUD;
import com.js.dto.Product;

public class GetProductById {
	
	public static void main(String[] args) {
		ProductCRUD pc = new ProductCRUD();
		Product p = pc.getProductById(4);
		if (p!=null) {
			System.out.println(p);
		} else {
            System.out.println("No Product");
		}
	}

}
