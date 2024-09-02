package com.nt.controller;

import java.net.http.HttpRequest;
import java.util.Map;

import org.hibernate.query.Page;
import org.hibernate.query.SortDirection;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.data.web.PageableDefault;
import org.springframework.http.HttpRange;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.nt.entity.Employee;
import com.nt.service.IEmployeeMgmtService;

import jakarta.servlet.http.HttpSession;

@Controller
public class EmployeeOperationController {

	// get Service obj
	@Autowired
	private IEmployeeMgmtService empService;

	// show home page
	@GetMapping("/")
	public String showHome() {
		// lvn
		return "home";
	}

	// get Employee list
	@GetMapping("/report")
	public String showAllEmployeeData(Map<String, Object> map) {
		// invoke b.method
		Iterable<Employee> empsList = empService.getAllEmployeeData();
		// keep in shared memory
		map.put("empsList", empsList);

		// lvn
		return "show_report";
	}

	// launch the add emp form
	@GetMapping("/add_emp")
	public String showAddEmpForm(@ModelAttribute("emp") Employee emp) {
		// lvn
		return "register";
	}

	
	
	//add employee
//	@PostMapping("/add_emp")
//	public String registerEmployee(Map<String, Object> map, @ModelAttribute("emp") Employee emp) {
//		// invoke service
//		String msg = empService.addEmployee(emp);
//		// get all employee
//	//	Iterable<Employee> empSList = empService.getAllEmployeeData();
//		// keep result in shared memory
//		System.out.println(msg);
//		map.put("resultMsg", msg);
//	//	map.put("empsList", empSList);
//		// lvn
//	//	return "show_report";
//		
//		//SOLVE DUPLICATION PROBLEM
//		//redirect 
//		return "redirect:report";
//
//	}

//	// add Employee
//	@PostMapping("/add_emp")
//	public String registerEmployee(RedirectAttributes attr, @ModelAttribute("emp") Employee emp) {
//		// invoke service
//		String msg = empService.addEmployee(emp);
//		// get all employee
//	//	Iterable<Employee> empSList = empService.getAllEmployeeData();
//		// keep result in shared memory
//		System.out.println(msg);
//		attr.addAttribute("resultMsg", msg);
//	//	map.put("empsList", empSList);
//		// lvn
//	//	return "show_report";
	
//		
//		//SOLVE DUPLICATION PROBLEM
//		//redirect 
//		return "redirect:report";
//
//	}

	
	//dupilication problem solved
	// add Employee
	@PostMapping("/add_emp")
	public String registerEmployee(HttpSession session, @ModelAttribute("emp") Employee emp) {
		// invoke service
		String msg = empService.addEmployee(emp);
		// get all employee
		// Iterable<Employee> empSList = empService.getAllEmployeeData();
		// keep result in shared memory
		//System.out.println(msg);
		session.setAttribute("resultMsg", msg);
		// map.put("empsList", empSList);
		// lvn
		// return "show_report";

		// SOLVE DUPLICATION PROBLEM
		// redirect
		return "redirect:reportPage";

	}
	
	
	//launch edit form
	@GetMapping("/edit")
	public String showEditFormPage(@ModelAttribute("emp") Employee emp,@RequestParam("empno") int empno) {
		//use service get pervious emp obj
		Employee emp1=empService.editEmployeeById(empno);
		// copy emp object
		BeanUtils.copyProperties(emp1, emp);
		//lvn
		return "update_emp";
		
	}
	
	// update employee
	@PostMapping("/edit")
	public String updateEmployee(@ModelAttribute("emp") Employee emp,HttpSession session) {
		//use service update emp obj
		String msg=empService.updateEmployee(emp);
		// result in shared memory
	     session.setAttribute("resultMsg",msg );
		//lvn
		return "redirect:reportPage";
		
	}
	//delete Employee
	@GetMapping("/delete")
	public String deleteEmployee(@RequestParam("empno") int empno,HttpSession session) {
		//use service
		String msg=empService.deleteEmployeeById(empno);
		//resultMsg in session memory
		session.setAttribute("resultMsg", msg);
		//redirect
		return "redirect:reportPage";
	}
	
	@GetMapping("/reportPage")
	public String showEmployeeReport(Map<String,Object> map,@PageableDefault(page = 0,size=5,sort="job",direction = Sort.Direction.ASC) Pageable pageable) {
		//use service
		org.springframework.data.domain.Page<Employee> page=empService.getEmployeeReportDataByPage(pageable);
		//keep result in shared memory
		map.put("page", page);
		
		//lvn
		return "show_report_page";
	}

}
