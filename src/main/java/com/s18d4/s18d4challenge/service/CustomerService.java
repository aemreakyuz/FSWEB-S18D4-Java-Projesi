package com.s18d4.s18d4challenge.service;

import com.s18d4.s18d4challenge.entity.Customer;

import java.util.List;

public interface CustomerService {
    List<Customer> findAll();
    Customer find(long id);

    Customer save(Customer customer);

    Customer delete(long id);
}
