package com.emp.repo;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.emp.model.Employee;

public interface EmpRepository extends MongoRepository<Employee, Integer>{

}
