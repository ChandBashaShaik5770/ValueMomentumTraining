package com.vm.session.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class ProductDetails
{
	public static void main(String[] args) 
	{
		
		ArrayList<Product> arrayList=new ArrayList<Product>();
		
		
		/*Product product1=new Product(101,"Dell",650000);
		Product product2=new Product(102,"HP",60000);
		Product product3=new Product(103,"ASUS",50000);
		Product product4=new Product(104,"APPLE",80000);*/
		
		
		
		arrayList.add(new Product(101,"Dell",65000));
		arrayList.add(new Product(102,"HP",60000));
		arrayList.add(new Product(103,"ASUS",50000));
		arrayList.add(new Product(104,"APPLE",80000));
		
		
		System.out.println(arrayList);
		
		
		for(Product product:arrayList)
		{
			if(product.getPrice()>=65000)
			{
			System.out.println("Name : "+product.getName()+"        Id : "+product.getId());
			}
		}
		
		Collections.sort(arrayList, new PriceSorting());
		System.out.println("----------After Sorting--------------------");
		
		for(Product product:arrayList)
		{


			System.out.println(product);
		}
		
		
		Collections.sort(arrayList, new NameSorting());
		System.out.println("----------After Name Sorting--------------------");
		
		for(Product product:arrayList)
		{


			System.out.println(product);
		}
		
	}
		

}




class NameSorting implements Comparator<Product>
{

	@Override
	public int compare(Product o1, Product o2) {
		
		return o1.getName().compareTo(o2.getName());
	}
	
}
