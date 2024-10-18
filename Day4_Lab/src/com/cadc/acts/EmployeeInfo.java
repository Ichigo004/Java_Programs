package com.cadc.acts;

public class EmployeeInfo {
	
	private String name;
	private int empId;
	private String dept;
	private double salary;
	private static int IdGen = 1000;
	
	public EmployeeInfo()
	{
		this.name = " ";
		this.empId = IdGen++;
		this.dept = " ";
		this.salary = 0.0;
	}
	
	public EmployeeInfo(String name, String dept, double salary)
	{
		this.name = name;
		this.empId = IdGen++;
		this.dept = dept;
		this.salary = salary;
	}
	
	public int GetEmpId()
	{
		return empId;
	}
	
	public double GetSalary()
	{
		return salary;
	}

	
	public void Display() 
	{
		System.out.println("EmployeeInfo [name=" + name + ", empId=" + empId + ", dept=" + dept + ", salary=" + salary + " ]") ;
	}
	
	
}
