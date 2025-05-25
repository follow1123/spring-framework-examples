package org.example.dao;

import org.example.entities.Account;

public class JpaAccountDao {

    public Account getAccountById(String id) {
        Account account = new Account();
        account.name = "aaa";
        return account;
    }
}
