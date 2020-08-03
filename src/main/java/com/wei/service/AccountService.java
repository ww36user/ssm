package com.wei.service;

import com.wei.pojo.Account;

import java.util.List;

public interface AccountService {
    void addAccount(Account account);

    void deleteAccountById(int id);

    void updateAccount(Account account);

    Account queryAccountById(int id);

    List<Account> queryAllAccount();
}
