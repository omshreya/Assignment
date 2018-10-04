package com.collection;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.stream.Collectors;

class Emp implements Comparable<Emp>
{
	private Integer empId;
	private String empName;
	private int age;
	private Double salary;
	
	public Emp(int empId, String empName, int age, Double salary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
	}
	
	public Emp(Integer empId, String empName)
	{
		this.empId = empId;
		this.empName = empName;
	}

	public int getEmpId() 
	{
		return empId;
	}


	public void setEmpId(int empId) 
	{
		this.empId = empId;
	}


	public String getEmpName() 
	{
		return empName;
	}

	public void setEmpName(String empName)
	{
		this.empName = empName;
	}

	public int getAge() 
	{
		return age;
	}

	public void setAge(int age) 
	{
		this.age = age;
	}

	public Double getSalary() 
	{
		return salary;
	}

	public void setSalary(Double salary)
	{
		this.salary = salary;
	}
	
	@Override
	public String toString()
	{
		return "Employee [empId=" + empId + ", empName=" + empName + ", age=" + age + ", salary=" + salary + "]";
	}

	@Override
	public int hashCode()
	{
		int result = 31;
		//int result = 1;
        result = result + empId;
		result = result + empName.hashCode();
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (!(obj instanceof Emp)) 
		{
		       return false;
		}
		Emp other = (Emp) obj;
		return other.empId.equals(empId)&& other.getEmpName().equals(empName);
	}
	
	public int compare(Emp o1, Emp o2) 
	 { 
		if(o1.salary==o2.salary)
       	{
			return 0; 
       	}
       	else if(o1.salary>o1.salary)  
       	{
       		return -1;  
       	}
       	else
       	{
       		return 1; 
       	}  	
	  }

	@Override
	public int compareTo(Emp o) {
		if(o.salary>this.salary)
       	{
			return 1; 
       	}
       	else if(o.salary<this.salary)  
       	{
       		return -1;  
       	}
		return 0;
	}
}

public class TreeMapDemo 
{
	public static void Sort(Map<Emp,Emp> maps)
	{
		Map<Emp,Emp> map12=new TreeMap<Emp,Emp>(maps);
		 for (Map.Entry<Emp,Emp> key :map12.entrySet()) 
			{
				 Emp emp=(Emp)key.getValue();
				 System.out.println(emp.getEmpId()+" "+emp.getEmpName()+" "+emp.getAge()+" "+emp.getSalary());
		    }
			
	}
	public static void main(String[] args) 
	{
		int choice,key,val,x;
		Integer id;
		double sal;
		String name;
		Emp e=new Emp(1,"shreya",23,25000.00);
		Emp e1=new Emp(2,"poonam",23,30000.00);
		Emp e2=new Emp(3,"neeraj",22,35000.00);
		TreeMap<Emp,Emp> map=new TreeMap<>();
		map.put(e, e);
		map.put(e2, e2);
		map.put(e1, e1);
		List<Emp> empList = map.values().stream().collect(Collectors.toList());

		Scanner sc=new Scanner(System.in);
		do
		{
			System.out.println("Enter your choice:\n 1:Display \n 2:Add Employee\n 3:Search Employee\n 4:Sort");
			choice=sc.nextInt();
			Iterator<Entry<Emp, Emp>> trav=map.entrySet().iterator();
			switch(choice)
			{
				case 1 : 
						 while(trav.hasNext())
						 {
							Map.Entry record=(Map.Entry)trav.next();
							Emp j=(Emp)record.getValue();
					        System.out.println(record.getKey()+" "+j.getEmpId()+" "+j.getEmpName()+" "+j.getAge()+" "+j.getSalary());
						 }
						 break;
						 
				case 2 : System.out.println("Enter id:");
						 id=sc.nextInt();
						 System.out.println("Enter name");
						 name=sc.next();
						 System.out.println("Enter age:");
						 x=sc.nextInt();
						 System.out.println("Enter salary:");
						 sal=sc.nextDouble();
						 Emp e4=new Emp(id,name,x,sal);
						 map.put(e4, e4);
						 break;
				case 3 : System.out.println("Enter id:");
				 		 id=sc.nextInt();
				 		 System.out.println("Enter name");
				 		 name=sc.next();
				 		 Emp e5=new Emp(id,name);
				 		 Emp e6=map.get(e5);
				 		 System.out.println(e6.getEmpId()+"\n"+e6.getEmpName());
		        		 break;
				case 4 : Sort(map);
						 break;
						 
			}
		}while(choice!=0);	
	}
}
