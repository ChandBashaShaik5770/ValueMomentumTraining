package com.vm.session.assignment;

import java.awt.List;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ProductStreamMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Product> product = new ArrayList<Product>();
		product.add(new Product(101, "mobile", "electronic", 12000, 50));
		product.add(new Product(102, "rice", "non-electronic", 500, 10));
		product.add(new Product(103, "mobile", "non-electronic", 12000, 50));
		product.add(new Product(104, "mobile", "non-electronic", 12000, 50));
		product.add(new Product(105, "laptop", "electronic", 50000, 25));
		product.add(new Product(106, "mobile", "electronic", 12000, 50));
		product.add(new Product(107, "ipad", "electronic", 60000, 40));
		product.add(new Product(108, "mobile", "non-electronic", 12000, 50));
		product.add(new Product(109, "mobile", "non-electronic", 12000, 50));
		product.add(new Product(110, "chargers", "electronic", 10000, 75));
		product.add(new Product(1,"oranges","fruits",23000,21));
        product.add(new Product(2,"fridge","electronics",22000,23));
        product.add(new Product(3,"apples","fruits",21000,20));
        product.add(new Product(4,"washingmachine","electronics",24000,42));
        product.add(new Product(5,"bananas","fruits",25000,21));
		
		System.out.println("Total Count = "+totalCount(product));
		
		//System.out.println(byCategory(product, "electronic"));
		System.out.println("===========");

		ArrayList<Product> a1=(ArrayList<Product>) byCategory(product, "electronic");
		for(Product c:a1)
		{
		System.out.println(c);
		}

		//product.stream().filter(s->s.getCategory().equalsIgnoreCase("electronic")).forEach(System.out::println);
		
		System.out.println("===========");
		//product.stream().filter(s->s.getPrice()>13000).forEach(s->System.out.println(s));
		ArrayList<Product> a=(ArrayList<Product>) price1(product);
		for(Product c:a)
		{
		System.out.println(c);
		}
		
		
		
		
  
       
       
        System.out.println("====================Selecting min max ===================");
        Product var = product.stream().max(Comparator.comparingInt(Product::getPrice)).get();

        System.out.println();
        System.out.print("MAX Price Product is : ");
        System.out.println(var.getName()+" "+var.getPrice());
        Product var1 = product.stream().min(Comparator.comparingInt(Product::getPrice)).get();
   
        System.out.println();
        System.out.print("MIN Price Product is : ");
        System.out.println(var1.getName()+" "+var1.getPrice());
        System.out.println();
        



            System.out.println("================sorting by price or name ===============");
          System.out.println();
         System.out.println("sorting by price : ");
         product.stream().sorted(Comparator.comparing(p->p.getPrice())).forEach(p->System.out.println(p.getName()+" "+p.getPrice()));
//products.stream().sorted(Comparator.comparing(p->((Product) p).getPrice()).reversed()).forEach(p->System.out.println(p.getPname()+" "+p.getPrice()));//Dexcending order
       System.out.println();
         System.out.println("sorting by name : ");
         product.stream().sorted(Comparator.comparing(p->p.getName())).forEach(p->System.out.println(p.getName()+" "+p.getPrice()));


                             System.out.println();
             
           System.out.println("============Product Name to UpperCase========");
           product.stream().map(m->m.getName().toUpperCase()).forEach(System.out::println);
 
                    System.out.println();
           System.out.println("=============count of product by category===========");
           long count= product.stream().filter(p->p.getCategory().equalsIgnoreCase("fruits")).count();
              System.out.println("Number of Products By Category fruits are : "+count);
               long  qc = product.stream().filter(p->p.getCategory().equalsIgnoreCase("fruits")).map(p->p.getQuantity()).reduce(0,(A,B)->A+B);
                 System.out.println("All product quantities of fruits are : "+qc);
}
		
		
		
		
		
		
	

	static long totalCount(ArrayList<Product> count)
	{
		return count.stream().count();
	}
	static ArrayList<Product> byCategory(ArrayList<Product> p,String category)
	{
	return (ArrayList<Product>) p.stream().filter(s->s.getCategory().equalsIgnoreCase(category)).collect(Collectors.toList());
		
	}	
	
	static ArrayList<Product> price1(ArrayList<Product> p)
	{
		return (ArrayList<Product>) p.stream().filter(s->s.getPrice()>13000).collect(Collectors.toList());
	}
}


