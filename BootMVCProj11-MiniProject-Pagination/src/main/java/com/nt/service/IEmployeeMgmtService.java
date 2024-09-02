package com.nt.service;

import org.springframework.data.domain.Pageable;

import com.nt.entity.Employee;

public interface IEmployeeMgmtService {

	public Iterable<Employee> getAllEmployeeData();
	public String addEmployee(Employee emp);
	public Employee editEmployeeById(int eno);
	public String updateEmployee(Employee emp);
	public String deleteEmployeeById(int eno);
	public org.springframework.data.domain.Page<Employee> getEmployeeReportDataByPage(Pageable pageable);
	
}
