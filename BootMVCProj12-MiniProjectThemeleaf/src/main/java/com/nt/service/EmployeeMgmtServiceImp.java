package com.nt.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nt.entity.Employee;
import com.nt.repository.IEmployeeRepository;

@Service
public class EmployeeMgmtServiceImp implements IEmployeeMgmtService {

	//get Dao object
	@Autowired
	private IEmployeeRepository empDao;
	
	//get all Employee data
	@Override
	public Iterable<Employee> getAllEmployeeData() {
		//invoke repository
		Iterable<Employee> list= empDao.findAll();
		//return Employee List
		
		return list;
	}

	
	//add Employee
	@Override
	public String addEmployee(Employee emp) {
		int id=empDao.save(emp).getEmpno();
		return "Employee added successfully with id::"+id;
	}


	//edit employee 
	@Override
	public Employee editEmployeeById(int eno) {
		//load employee
	return empDao.findById(eno).orElseThrow(()-> new IllegalArgumentException("Employee not found"));
		
	}

    //update Employee
	@Override
	public String updateEmployee(Employee emp) {
          // update emp
		
		
		return "Employee updated sucessfully with id:"+empDao.save(emp).getEmpno();
	}


	//Delete Employee
	@Override
	public String deleteEmployeeById(int eno) {
		empDao.deleteById(eno);
		return eno+" employee id Employee deleted sucessfully";
	}

}
