package com.vm.session.newFeatures;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class EmployeeStreamDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<Employee> employee = new ArrayList<Employee>();
		
		employee.add(new Employee(101, "sam", "hr", 58000, 25));
		//employee.add(new Employee(101, "sam", "hr", 58000, 25));
		employee.add(new Employee(102, "sai", "dev", 90000, 28));
		employee.add(new Employee(102, "sai", "dev", 90000, 28));
		employee.add(new Employee(103, "venkat", "tester", 58000, 30));
		employee.add(new Employee(104, "anil", "tester", 20000, 31));
		employee.add(new Employee(105, "akash", "dev", 80000, 35));
		
		employee.forEach(System.out::println);
		System.out.println("======================");
		long employeeCount=employee.stream().count();
		System.out.println("Employee Count = "+employeeCount);
		
		System.out.println("======================");
		System.out.println("Only HR and Dev");
		employee.stream().filter(s->s.getDept().equalsIgnoreCase("dev")).forEach(System.out::println);
		System.out.println("======================");

		System.out.println("Starts with a");		
		employee.stream().filter(s1->s1.getName().startsWith("a")).forEach(s->System.out.println(s));
		System.out.println("======================");

		System.out.println("Salary > 50000");
		employee.stream().filter(s1->s1.getSalary()>50000).forEach(s1->System.out.println(s1));
		System.out.println("======================");

		long count1=employee.stream().filter(s1->s1.getSalary()>50000).count();
		System.out.println("Count of Employee's > 50000 salaries = "+count1);
		
		System.out.println("======================");
		System.out.println("Length of Names of Employee's");
		employee.stream().map(s->s.getId()+" "+s.getName()+" "+s.getName().length()).forEach(s->System.out.println(s));
		
		System.out.println("======================");
		employee.stream().map(s->s.getId()+" Name = "+s.getName()+" Dept = "+s.getDept()+" Origianl salary = "+s.getSalary()+" New salary = "
				+s.getSalary()*0.20+" Age = "+s.getAge()).forEach(s->System.out.println(s));

		System.out.println("After Soritng");
		employee.stream().sorted((s1,s2)->
		{
			if(s1.getSalary()==s2.getSalary())
				return 0;
			else if(s1.getSalary()>s2.getSalary())
				return 1;
			else
				return -1;
			
		}).forEach(System.out::println);
		
		System.out.println("===After Name Soritng1===");
		List<Employee> e=employee.stream().sorted((o1,o2)->
		{
			return o1.getName().compareTo(o2.getName());
			
		}).collect(Collectors.toList());
		e.forEach(System.out::println);

		System.out.println("===After Name Soritng2===");
		employee.stream().sorted(Comparator.comparing(Employee::getName)).forEach(System.out::println);
		
		System.out.println("===After Reverse Soritng2===");
		employee.stream().sorted(Comparator.comparing(Employee::getName).reversed()).forEach(System.out::println);

		
		System.out.println("Min Salary");
		Employee minsalary=employee.stream().min(Comparator.comparing(Employee::getSalary)).get();
		System.out.println(minsalary);
		
		
		long sum=employee.stream().collect(Collectors.summarizingInt(Employee::getSalary)).getSum();
		System.out.println("Total salary of all employees "+sum);
		
		
		
		long sum1=employee.stream().filter(s->s.getDept().equals("hr")).collect(Collectors.summarizingInt(Employee::getSalary)).getSum();

		System.out.println("Total salary of all HR's = "+sum1);
		
		
		System.out.println("==========Unique==============");
		
		employee.stream().distinct().forEach(System.out::println);	
		//uniqueEmp.forEach(System.out::println);
		
		System.out.println("=====================");
		long s=2;
		employee.stream().skip(s).forEach(System.out::println);
		
		
		
	}

}
