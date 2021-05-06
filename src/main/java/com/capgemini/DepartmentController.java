package com.capgemini;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


// http://localhost:8080/department
@RestController
@RequestMapping("/department/")
public class DepartmentController {

	@GetMapping("/create")
	public String create() {
		return "Dept Created";
	}
	
	@GetMapping("/update")
	public String update() {
		return "Dept Updated";
	}
	
}
