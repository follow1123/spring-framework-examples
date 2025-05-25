package org.example.service;

import org.example.dao.JpaAccountDao;
import org.example.dao.JpaItemDao;
import org.example.entities.Account;

public class PetStoreServiceImpl {
    private JpaAccountDao accountDao;
    private JpaItemDao  itemDao;

    public PetStoreServiceImpl() {}

    public JpaAccountDao getAccountDao() {
        return accountDao;
    }

    public void setAccountDao(JpaAccountDao accountDao) {
        this.accountDao = accountDao;
    }

    public JpaItemDao getItemDao() {
        return itemDao;
    }

    public void setItemDao(JpaItemDao itemDao) {
        this.itemDao = itemDao;
    }

    public Account getAccountById(String id) {
        Account account = accountDao.getAccountById(id);
        account.items = itemDao.getItemsByAccount();
        return account;
    }
}
