package com.s18d4.s18d4challenge.repository;

import com.s18d4.s18d4challenge.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
