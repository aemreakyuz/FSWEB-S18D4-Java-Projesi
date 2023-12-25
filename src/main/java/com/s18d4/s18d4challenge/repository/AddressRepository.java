package com.s18d4.s18d4challenge.repository;

import com.s18d4.s18d4challenge.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address, Long> {
}
