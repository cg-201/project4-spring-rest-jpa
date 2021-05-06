package com.capgemini;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.entities.Employee;
import com.capgemini.repository.EmployeeRepository;

@RestController
public class EmployeeController {
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@GetMapping
	public String create() {
		
		Employee e = new Employee();
		e.setName("rahula");
		e.setEmail("rahul@gmail.com");
		e.setMobile("88997766");
		
		employeeRepository.save(e);
		
		return "Record Added!!";
	}
}
