package com.collection;
public class Employee 
{
	private Integer empId;
	private String empName;
	private int age;
	private Double salary;
	
	public Employee(int empId, String empName) 
	{
		this.empId = empId;
		this.empName = empName;
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
		if (!(obj instanceof Employee)) 
		{
		       return false;
		}
		Employee other = (Employee) obj;
		return other.empId.equals(empId)&& other.getEmpName().equals(empName);
	}
}
