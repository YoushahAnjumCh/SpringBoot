package com.emp.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.emp.model.Employee;
import com.emp.repo.EmpRepository;

@RestController
public class EmpController {

	@Autowired
	private EmpRepository repository;
	

	@PostMapping("/addemp")
	public void saveEmp(@RequestBody Employee employee) {
		repository.save(employee);
	}
	
	@GetMapping("/emp")
	public List<Employee> getEmpl() {
		return repository.findAll();
	}

	@GetMapping("/emp/{id}")
	public Optional<Employee> getEmp(@PathVariable int id) {
		return repository.findById(id);
	}

	
	@DeleteMapping("/del/{id}")
	public void deleteEmp(@PathVariable int id) {
		repository.deleteById(id);
	
	}
	@PutMapping("/put/{id}")
	public void putEmp(@RequestBody Employee employee,@PathVariable int id)
	{
		repository.save(employee);
	}
	

}
