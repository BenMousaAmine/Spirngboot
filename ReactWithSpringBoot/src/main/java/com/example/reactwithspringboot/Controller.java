package com.example.reactwithspringboot;

import Repository.EmployeeRepository;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provaReact")
public class Controller {
private final EmployeeRepository employeeRepository ;

    public Controller(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
}
