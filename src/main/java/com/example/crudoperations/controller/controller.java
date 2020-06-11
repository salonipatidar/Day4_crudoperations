package com.example.crudoperations.controller;

import com.example.crudoperations.model.Employee;
import com.example.crudoperations.service.employeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class controller
{
    @RequestMapping(value = "/hello")
    public String sayHello() {
        return "Hello World Developer!!!";
    }


    @Autowired
    private employeeService empService;

    @PostMapping("/users")
    public Employee saveUser(@RequestBody Employee emp){

        return empService.userSave(emp);
    }

    @GetMapping("/users")
    public List<Employee> allUsers() {

        return empService.findAll();
    }

    @GetMapping("/users/count")
    public Long count() {

        return empService.count();
    }

    @DeleteMapping("/users/{id}")
    public void delete(@PathVariable String id) {

        Long userId = Long.parseLong(id);
        empService.deleteById(userId);
    }

}
