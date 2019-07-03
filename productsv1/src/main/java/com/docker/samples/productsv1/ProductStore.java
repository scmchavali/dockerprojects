package com.docker.samples.productsv1;

import java.util.ArrayList;
import java.util.List;

public class ProductStore {
	   public List<Product> getAllProducts(){
	      List<Product> productlist = null;
		  productlist = new ArrayList<Product>();
	      
	            Product p = new Product(1, "conditioners", 5);
	            productlist.add(p);
				
				p = new Product(2, "Vegetables", 10);
	            productlist.add(p);
				
				p = new Product(3, "Fruits", 10);
	            productlist.add(p);
				
				p = new Product(4, "Kitchenware", 5);
	            productlist.add(p);
				
				p = new Product(5, "cosmetics", 5);
	            productlist.add(p);
	            
	      return productlist;
	   }
	   
	   public int getprice(int id){
		   Product p = new Product();
		   p.setId(id);
		   // if product id is 1, product is conditioners, any conditioner is Rs 100/-
		   if(p.getId()==1)
		   return 100;
		   
		   // product id is 2 , any vegetables is 50/-
		   else if(p.getId()==2) 
			   return 50;
		   // product id is 3, any fruit is 20/-
		   else if(p.getId()==3)
			   return 20;
		   //product id is 4, any kitchenware is 300
		   else if (p.getId()==4){
			   System.out.println("Returning" + 300);
			   return 300;
		   }
		   //finally it is cosmetics, any consmetics is 200
		   else
		   return 0;
	   }
}
