package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

// http://localhost:8080/employee
@RestController
@RequestMapping("/employee/")
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	// http://localhost:8080/employee/create
	@GetMapping("/create")
	public String create() {
		// logic for create
		return "Record Added!!";
	}
	
	// http://localhost:8080/employee/update
	@GetMapping("/update")
	public String update() {
		// logic for update
		return "Record Updated!!";
	}
	
	
	// http://localhost:8080/employee/delete
	@GetMapping("/delete")
	public String delete() {
		// logic for delete
		return "Record Deleted!!";
	}
}
