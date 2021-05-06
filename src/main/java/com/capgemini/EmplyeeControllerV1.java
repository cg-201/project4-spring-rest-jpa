package com.capgemini;

import javax.websocket.server.PathParam;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
	
	@GetMapping("/create1")
	public String create1(@RequestParam String name, @RequestParam String email, @RequestParam String mobile) {

		Employee e = new Employee();
		e.setName(name);
		e.setEmail(email);
		e.setMobile(mobile);

		// adding record
		employeeRepository.save(e);

		return "Employee V1 Created1";
	}
	
	
	@GetMapping("/create2")
	public String create2(Employee e) {

		// adding record
		employeeRepository.save(e);

		return "Employee V1 Created2";
	}
	
	
	@GetMapping("/find/{id}")
	public Employee findById(@PathVariable int id) {
		
		Employee e = employeeRepository.findById(id).get();
		System.out.println(e);
		return e;
	}
	

	@GetMapping("/update/{id}")
	public String update(@PathVariable int id, Employee inputData) {
		
		Employee dbEmployee =  employeeRepository.findById(id).get();
		if(dbEmployee != null) {
			dbEmployee.setEmail(inputData.getEmail());
			dbEmployee.setName(inputData.getName());
			
			employeeRepository.save(dbEmployee);
		}
		
		return "Employee v1 Updated!!";
	}

	
	@GetMapping("/delete/{id}")
	public String delete(@PathVariable int id) {
		return "Employee v1 delete!!";
	}
}
