package com.banking.bankapp.service;

import com.banking.bankapp.model.Account;
import com.banking.bankapp.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.math.BigDecimal;
import java.util.Optional;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository repo) {
        this.accountRepository = repo;
    }

    public Account createAccount(String holderName, BigDecimal initialBalance) {
        Account account = new Account();
        account.setHolderName(holderName);
        account.setBalance(initialBalance);
        return accountRepository.save(account);
    }

    public BigDecimal checkBalance(Long id) {
        return accountRepository.findById(id)
                .map(Account::getBalance)
                .orElse(null);
    }

    public String deposit(Long id, BigDecimal amount) {
        Optional<Account> accOpt = accountRepository.findById(id);
        if (accOpt.isPresent()) {
            Account acc = accOpt.get();
            acc.setBalance(acc.getBalance().add(amount));
            accountRepository.save(acc);
            return "Deposit Successful";
        }
        return "Account Not Found";
    }

    public String withdraw(Long id, BigDecimal amount) {
        Optional<Account> accOpt = accountRepository.findById(id);
        if (accOpt.isPresent()) {
            Account acc = accOpt.get();
            if (acc.getBalance().compareTo(amount) >= 0) {
                acc.setBalance(acc.getBalance().subtract(amount));
                accountRepository.save(acc);
                return "Withdraw Successful";
            } else {
                return "Insufficient Funds";
            }
        }
        return "Account Not Found";
    }
}
