package com.wei.controller;

import com.wei.pojo.Account;
import com.wei.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

@Controller
@RequestMapping("/account")
public class AccountController {

    @Autowired
    private AccountService accountService;

    @RequestMapping("/queryAllAccount")
    public String queryAllAccount(Model model ){
        List<Account> list = accountService.queryAllAccount();
        model.addAttribute("accounts",list);
        return "list";
    }
    @RequestMapping("/queryAccountById")
    public void queryAccountById(Model model,Integer id){
        Account account = accountService.queryAccountById(id);
        model.addAttribute("accountOne",account);
        return ;
    }
    @RequestMapping("/updateAccount")
    public void updateAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.updateAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/queryAllAccount");
    }

    @RequestMapping("/deleteAccountById")
    public void deleteAccountById(Integer id, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.deleteAccountById(id);
        response.sendRedirect(request.getContextPath()+"/account/queryAllAccount");
    }

    @RequestMapping("/addAccount")
    public void addAccount(Account account, HttpServletRequest request, HttpServletResponse response) throws IOException {
        accountService.addAccount(account);
        response.sendRedirect(request.getContextPath()+"/account/queryAllAccount");
    }

}
