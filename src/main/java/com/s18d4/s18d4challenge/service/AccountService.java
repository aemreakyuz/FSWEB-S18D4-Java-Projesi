package com.s18d4.s18d4challenge.service;

import com.s18d4.s18d4challenge.entity.Account;

import java.util.List;

public interface AccountService {
    List<Account> findAll();
    Account find(long id);

    Account save(Account account);

    Account delete(long id);
}
