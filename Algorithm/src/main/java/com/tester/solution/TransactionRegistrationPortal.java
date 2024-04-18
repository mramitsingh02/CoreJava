package com.tester.solution;

import java.util.List;

public interface TransactionRegistrationPortal {
    TransactionRegistrationPortal getRegistrationPortal();
    void registerTransaction(Customer customer, Transaction trx);
    List<Transaction> getTransactions(Customer customer);
}
