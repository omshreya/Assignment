package com.collection;
@SuppressWarnings("rawtypes")
public class Employee implements Comparable
{
	private int empId;
	private String empName;
	private int age;
	private Double salary;
	
	public Employee() 
	{
	}

	public Employee(int empId, String empName, int age, Double salary) 
	{
		this.empId = empId;
		this.empName = empName;
		this.age = age;
		this.salary = salary;
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
	
	public int compareTo(Employee emp)
	{
		if(this.salary==emp.salary)
		{
		return 0; 
		}
		else if(this.salary>emp.salary)  
		{
		return -1;  
		}
		else
		{
		return 1; 
		}
	}

	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
