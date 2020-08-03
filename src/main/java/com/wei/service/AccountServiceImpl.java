package com.wei.service;


import com.wei.dao.AccountMapper;
import com.wei.pojo.Account;

import java.util.List;

public class AccountServiceImpl implements AccountService {

    public void setAccountMapper(AccountMapper accountMapper) {
        this.accountMapper = accountMapper;
    }

    private AccountMapper accountMapper;




    @Override
    public void addAccount(Account account) {
        accountMapper.addAccount(account);
    }

    @Override
    public void deleteAccountById(int id) {
        accountMapper.deleteAccountById(id);
    }

    @Override
    public void updateAccount(Account account) {
        accountMapper.updateAccount(account);
    }

    @Override
    public Account queryAccountById(int id) {
        return accountMapper.queryAccountById(id);
    }

    @Override
    public List<Account> queryAllAccount() {
        return accountMapper.queryAllAccount();
    }
}
