package com.banking.bankapp.model;  // ✅ Corrected

import jakarta.persistence.*;
import java.math.BigDecimal;        // ✅ Corrected

@Entity
public class Account {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String holderName;

    private BigDecimal balance;     // ✅ Corrected

    public Account() {}

    public Long getId() {
        return id;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }
}
