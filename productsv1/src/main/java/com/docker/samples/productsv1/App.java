package com.docker.samples.productsv1;

import java.util.List;
import java.util.ListIterator;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	ProductStore ps = new ProductStore();
    	List<Product> pl = ps.getAllProducts();
    	ListIterator<Product> piterator = pl.listIterator();
    	while(piterator.hasNext()){
    	System.out.println(piterator.next().getName());
    	}
        System.out.println( "Hello World!" );
    }
}
