package com.nt.service;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {

	public Iterable<Employee> getAllEmployeeData();
	public String addEmployee(Employee emp);
	public Employee editEmployeeById(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int eno);
}
