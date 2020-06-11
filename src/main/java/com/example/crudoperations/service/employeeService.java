package com.example.crudoperations.service;

import com.example.crudoperations.model.Employee;
import com.example.crudoperations.repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class employeeService
{
    @Autowired
    private com.example.crudoperations.repository.employeeRepository employeeRepository;

    public List<Employee> findAll() {

        Iterable<Employee> it = employeeRepository.findAll();

        ArrayList<Employee> emp = new ArrayList<Employee>();
        it.forEach(e -> emp.add(e));

        return emp;}
        public Long count()
        {

            return employeeRepository.count();
        }

        public void deleteById (Long empId)
        {

            employeeRepository.deleteById(empId);
        }

        public Employee userSave(Employee emp)
        {

            return employeeRepository.save(emp);
        }

    }



