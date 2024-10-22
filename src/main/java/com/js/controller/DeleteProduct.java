package com.js.controller;

import com.js.dao.ProductCRUD;

public class DeleteProduct {
   public static void main(String[] args) {
	  ProductCRUD pc = new ProductCRUD();
	  if (pc.deleteProductById(2)) {
		System.out.println("Deleted");
	} else {
        System.out.println("Failed to Delete");
	}
}
}
