package com.banking.bankapp.repository;

import com.banking.bankapp.model.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AccountRepository extends JpaRepository<Account, Long> {
}
