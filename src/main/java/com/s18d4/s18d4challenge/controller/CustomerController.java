package com.s18d4.s18d4challenge.controller;

import com.s18d4.s18d4challenge.dto.CustomerResponse;
import com.s18d4.s18d4challenge.entity.Customer;
import com.s18d4.s18d4challenge.service.CustomerService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    private final CustomerService customerService;


    public CustomerController(CustomerService customerService) {
        this.customerService = customerService;

    }

    @PostMapping
    public CustomerResponse save(@RequestBody Customer c){
        Customer saved = this.customerService.save(c);
        return new CustomerResponse(saved.getId(), saved.getEmail(), saved.getSalary());

    }
}
