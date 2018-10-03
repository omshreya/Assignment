package com.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class CollecionDemo
{
	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc=new Scanner(System.in);
		
		Employee emp=new Employee(1,"shreya",23,25000.00);
		Employee emp1=new Employee(2,"poonam",23,30000.00);
		Employee emp2=new Employee(3,"neeraj",22,35000.00);
		Employee emp3=new Employee(4,"shreya",22,35000.00);
		Employee emp4=new Employee(5,"priyanka",22,40000.00);
		
		//Set<Employee> set=new HashSet<>();
		List <Employee> set = new ArrayList<>();
		set.add(emp);
		set.add(emp1);
		set.add(emp2);
		set.add(emp2);
		set.add(emp3);
		set.add(emp4);
		
		for (Employee e: set)
		{
	        System.out.println("Employee:- " + e);
	    }
		Iterator<Employee> itr=set.iterator();
		int choice=0;
		do
		{
			System.out.println("1:Display Record\n 2:Sort Record\n 3:Searching record\n 4:Add Record\n Enter Your choice:");
			choice=sc.nextInt();
			switch(choice)
			{
				case 1:
						while(itr.hasNext())
						{
							System.out.println(itr.next());
						}
						break;
				case 2:Collections.sort(set);
						break;
				case 3:	System.out.println("Enter employee id:");
						int id=sc.nextInt();
						System.out.println("Enter employee name:");
						String name=sc.next();
						Employee e;
						while(itr.hasNext())
						{
							e=itr.next();
							if((e.getEmpId()==id) && (e.getEmpName().equals(name)))
							{
								System.out.println(e.getEmpId()+" "+e.getEmpName()+" "+e.getAge()+" "+e.getSalary());
							}
						}					
						break;
			}
		}while(choice!=0);
		
	}
}
