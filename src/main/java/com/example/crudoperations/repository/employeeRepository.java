package com.example.crudoperations.repository;

import com.example.crudoperations.model.Employee;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface employeeRepository extends CrudRepository <Employee, Long>
{
}
