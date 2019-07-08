package com.docker.samples.productsv1;

import java.util.List;
import java.util.ListIterator;


import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

public class ListProductJob implements Job  {
	
	ProductStore ps = new ProductStore();
	List<Product> pl = ps.getAllProducts();
	ListIterator<Product> piterator = pl.listIterator();
	
	public void execute(JobExecutionContext arg0) throws JobExecutionException {
		// TODO Auto-generated method stub
		System.out.println("Job started running");
		while(piterator.hasNext()){
			System.out.println(piterator.next().getName());
			}
		
	}
}

