package com.s18d4.s18d4challenge.repository;

import com.s18d4.s18d4challenge.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
