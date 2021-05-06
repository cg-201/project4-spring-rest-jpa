package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

@RestController
@RequestMapping("/employee/v1/")
public class EmplyeeControllerV1 {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping("/create")
	public String create(String name, String email, String mobile) {
		
		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setMobile(mobile);
		
		// adding record
		employeeRepository.save(e);
		
		
		return "Employee V1 Created";
	}
	
	
	public String update() {
		return "Employee v1 Updated!!";
	}
	
	
	public String delete() {
		return "Employee v1 delete!!";
	}
}
