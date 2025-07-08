package com.banking.bankapp.controller;

import com.banking.bankapp.model.Account;
import com.banking.bankapp.service.AccountService;
import org.springframework.web.bind.annotation.*;

import java.math.BigDecimal;

@RestController
@RequestMapping("/api/accounts")
public class AccountController {

    private final AccountService service;

    public AccountController(AccountService service) {
        this.service = service;
    }

    @PostMapping
    public Account create(@RequestParam String holderName, @RequestParam BigDecimal initialBalance) {
        return service.createAccount(holderName, initialBalance);
    }

    @GetMapping("/{id}/balance")
    public BigDecimal getBalance(@PathVariable Long id) {
        return service.checkBalance(id);
    }

    @PostMapping("/{id}/deposit")
    public String deposit(@PathVariable Long id, @RequestParam BigDecimal amount) {
        return service.deposit(id, amount);
    }

    @PostMapping("/{id}/withdraw")
    public String withdraw(@PathVariable Long id, @RequestParam BigDecimal amount) {
        return service.withdraw(id, amount);
    }
}
